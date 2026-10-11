.class public final synthetic Lax/u0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/u0/c;


# direct methods
.method public synthetic constructor <init>(Lax/u0/c;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/u0/b;->q:Lax/u0/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/u0/b;->q:Lax/u0/c;

    invoke-static {v0}, Lax/u0/c;->a(Lax/u0/c;)V

    return-void
.end method
