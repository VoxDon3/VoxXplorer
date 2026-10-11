.class public final synthetic Lax/i/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/i/p;


# direct methods
.method public synthetic constructor <init>(Lax/i/p;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i/o;->q:Lax/i/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/i/o;->q:Lax/i/p;

    invoke-static {v0}, Lax/i/p;->a(Lax/i/p;)V

    return-void
.end method
