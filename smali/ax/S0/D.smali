.class public final synthetic Lax/S0/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/S0/z$d;


# direct methods
.method public synthetic constructor <init>(Lax/S0/z$d;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/S0/D;->q:Lax/S0/z$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/S0/D;->q:Lax/S0/z$d;

    invoke-static {v0}, Lax/S0/z$d;->a(Lax/S0/z$d;)V

    return-void
.end method
